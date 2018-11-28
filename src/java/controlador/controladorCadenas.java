
package controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import servicios.cadenas;

@Controller
public class controladorCadenas {
    
    @Autowired
    private cadenas objCad;
    
    @RequestMapping("/home")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
        
        ModelAndView model = new ModelAndView("/home");
        model.addObject("titulo", "Home");
        return model;
        
    }
    
    @RequestMapping("/vocales")
    public ModelAndView muestraVocales(HttpServletRequest request, HttpServletResponse response){
        
        ModelAndView model = new ModelAndView("/vocales");
        model.addObject("titulo", "Vocales");
        String cad = "liliana"; // String cad = request.getParameter("dato");                
        model.addObject("resultado", objCad.cuentaVocales(cad));
        return model;
        
    }
    
}
