
package controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import servicios.cadenas;

@Controller
public class cadenasController {
    
    @Autowired
    cadenas cs;
    
    @RequestMapping("/controller/vocales.htm")
    protected ModelAndView muestraVocales(HttpServletRequest request, HttpServletResponse response){
        
        ModelAndView mv = new ModelAndView("/resvocales");
        String cad = "ejemplo"; // String cad = request.getParameter("dato");                
        mv.addObject("resultado", cs.cuentaVocales(cad));
        return mv;
        
    }
    
}
