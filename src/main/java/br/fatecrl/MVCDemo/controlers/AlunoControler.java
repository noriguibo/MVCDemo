package br.fatecrl.MVCDemo.controlers;

import br.fatecrl.MVCDemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoControler {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoControler(){
        alunos.add(new Aluno("111111", "Enzo", 10, 8));
        alunos.add(new Aluno("222222", "Maria", 8, 8));
        alunos.add(new Aluno("333333", "Ricardo", 5, 7));
    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", alunos);
        return "alunos";
    }
}
