package PA4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class farmacias {
    @RequestMapping("/farmacias.html")
    public String form()
    {
        return "farmacias";
    }
}
