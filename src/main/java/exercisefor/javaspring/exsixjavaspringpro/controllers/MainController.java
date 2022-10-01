package exercisefor.javaspring.exsixjavaspringpro.controllers;

import exercisefor.javaspring.exsixjavaspringpro.models.Application;
import exercisefor.javaspring.exsixjavaspringpro.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping(value = "/")
    public String indexPage(Model model) {
        List<Application> applications = applicationRepository.findAll();
        model.addAttribute("applications", applications);
        return "index";
    }

    @GetMapping(value = "/application")
    public String applicationPage() {
        return "application";
    }

    @PostMapping(value = "/addapplication")
    public String addApplication(Application application) {
        applicationRepository.save(application);
        return "redirect:/";
    }

    @GetMapping(value = "/details/{id}")
    public String detailsPage(@PathVariable(name = "id") Long id, Model model) {
        Application application = applicationRepository.findById(id).orElse(null);
        model.addAttribute("applicatioon", application);
        return "details";
    }

    @PostMapping(value = "/saveapplication")
    public String saveApplication(@RequestParam(name = "id") Long id,
                                  @RequestParam(name = "userName") String userName,
                                  @RequestParam(name = "courseName") String courseName,
                                  @RequestParam(name = "phoneNumber") String phoneNumber,
                                  @RequestParam(name = "commentary") String commentary) {

            Application application = applicationRepository.findById(id).orElse(null);

            if (application != null) {
                application.setUserName(userName);
                application.setCourseName(courseName);
                application.setPhoneNumber(phoneNumber);
                application.setCommentary(commentary);
                application.setHandled(true);
                applicationRepository.save(application);
                return "redirect:/details/" + id;
            }

        return "redirect:/";
    }

    @PostMapping(value = "/deleteapplication")
    public String deleteApplication(@RequestParam(name = "id") Long id) {

        applicationRepository.deleteById(id);
        return "redirect:/";

    }

    @GetMapping(value = "/newapplication")
    public String newapplication(Model model) {
        List<Application> applications = applicationRepository.findAll();
        model.addAttribute("applications", applications);
        return "newapplication";
    }

    @GetMapping(value = "/processedapplication")
    public String processedApplication(Model model) {
        List<Application> applications = applicationRepository.findAll();
        model.addAttribute("applications", applications);
        return "processedapplication";
    }

}
