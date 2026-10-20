package Model.service;
import Model.entity.Status;
import Model.entity.Tarefa;
import java.util.HashSet;
import java.util.Set;

public class TarefaService {

    Set<Tarefa> ts = new HashSet<>();
    //CRUD
    public void criarTarefa(){
        Tarefa t = new Tarefa();
        int id = 0;
        t.setId(id++);
        t.setTitulo(IO.readln());
        t.setDescricao(IO.readln());
    }

}
