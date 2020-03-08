package com.example.controller;

import com.example.model.Phone;
import com.example.model.Producer;
import com.example.service.PhoneService;
import com.example.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private PhoneService phoneService;
    private ProducerService producerService;


    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    @Autowired
    public void setPhoneService(PhoneService phoneService) {
        this.phoneService = phoneService;
    }


    @GetMapping(value = "/phones")
    public ModelAndView allPhones() {
        List<Phone> phones = phoneService.allPhones();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("phones");
        modelAndView.addObject("phonesList", phones);
        return modelAndView;
    }

    @GetMapping(value = "/view/{id}")
    public ModelAndView viewPage(@PathVariable("id") int id) {/*@PathVariable указывает на то, что данный параметр (int id) получается из адресной строки.*/
        Phone phone = phoneService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("viewPage");
        modelAndView.addObject("phone", phone);
        return modelAndView;
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editPage(@PathVariable("id") int id) {
        Phone phone = phoneService.getById(id);
        List<Producer> producers = producerService.allProducers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("phone", phone);
        modelAndView.addObject("producers",producers);
        return modelAndView;
    }

    @PostMapping(value = "/edit")
    public ModelAndView editPhone(@ModelAttribute("phone") Phone phone, @RequestParam("producers_id") Integer producerId) {
        ModelAndView modelAndView = new ModelAndView();
        phone.setProducer(producerService.getById(producerId));
        modelAndView.setViewName("redirect:/phones");
        phoneService.edit(phone);
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        List<Producer> producers = producerService.allProducers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addPage");
        modelAndView.addObject("producers",producers);
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public ModelAndView addPhone(@ModelAttribute("phone") Phone phone, @RequestParam("producers_id") Integer producerId) {
        ModelAndView modelAndView = new ModelAndView();
        phone.setProducer(producerService.getById(producerId));
        modelAndView.setViewName("redirect:/phones");
        phoneService.add(phone);
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deletePhone(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/phones");
        Phone phone = phoneService.getById(id);
        System.out.println(phone);
        phoneService.delete(phone);
        return modelAndView;
    }
}
