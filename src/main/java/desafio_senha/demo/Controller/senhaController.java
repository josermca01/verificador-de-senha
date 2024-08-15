package desafio_senha.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import desafio_senha.demo.Entities.senha;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/validate-password")
public class senhaController {

    @PostMapping    
    private ResponseEntity<List<String>> insert(@RequestBody senha insert){
        var valida = insert.verify(insert.getValor());
        if (valida.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        else
		return ResponseEntity.badRequest().body(valida);
    }

}
