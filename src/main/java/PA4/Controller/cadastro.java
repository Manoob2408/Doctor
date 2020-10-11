package PA4.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class cadastro {
    @RequestMapping("/cadastro.html")
    public String form()
    {
        return "cadastro";
    }
}
