package com.anahitapp.anahit.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/subjects")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addSubject(@RequestParam String subjectName,@RequestParam String subjectCategory, @RequestParam Integer importance)
    {
        subjectRepository.save(new Subject(subjectName, subjectCategory, importance));
        return "Subject [" + subjectName + "] saved!";
    }

    @GetMapping(path="/getsubjects")
    public @ResponseBody Iterable<Subject> getAllSubjects()
    {
        return subjectRepository.findAll();
    }
}
