
package servicios;

import org.springframework.stereotype.Service;

@Service
public class cadenas {
    
    public int cuentaVocales(String valor) {
        String base = "AEIOU";
        int r = 0;
        for (int i=0; i<valor.length(); i++) {
            String c = valor.substring(i, i+1).toUpperCase();
            if (base.indexOf(c) >= 0) {
                r++;
            }
        }
        return r;        
    }
    
}
