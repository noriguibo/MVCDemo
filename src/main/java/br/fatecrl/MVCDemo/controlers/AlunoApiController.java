package br.fatecrl.MVCDemo.controlers;

import br.fatecrl.MVCDemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")

public class AlunoApiController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoApiController(){
        alunos.add(new Aluno("111111", "Enzo", 10, 8));
        alunos.add(new Aluno("222222", "Maria", 8, 8));
        alunos.add(new Aluno("333333", "Ricardo", 5, 7));
    }

    @GetMapping
    public List<Aluno> getAlunos()
    {
        return alunos;
    }

}
