/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.auto;
import com.sun.tools.xjc.model.AutoClassNameAllocator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author tomasdf
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {
    
    //siempre los metodos deben retornar un string
    @RequestMapping(method= RequestMethod.POST)
    public String recibir(@RequestParam("txtRut")String rut, Model model )
    {
        if (rut.trim().equals("")) {
            String a = "campos vacios";
            model.addAttribute("err", a);
            return "error";
        }else{
            
            auto a1 = new auto(1,"jiundai","color caca");
            model.addAttribute("auto", a1);
            return "exito";
        }
    }
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model)
    {
        return "index";
        
    }
}
