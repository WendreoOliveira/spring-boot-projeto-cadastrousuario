package com.projeto.cadastro_usuario.controller;

import com.projeto.cadastro_usuario.business.UsuarioService;
import com.projeto.cadastro_usuario.infrastructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorId(@RequestParam Integer id){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorId(@RequestParam Integer id){
        usuarioService.deletarUsuarioPorId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id,
                                                      @RequestBody Usuario usuario){
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }

}
