/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.ucs.libreria.service;

import java.util.List;
import pe.ucs.libreria.model.Post;

/**
 *
 * @author admin
 */
public interface PostService {
    int create(Post autor);
    int update(Post autor);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
