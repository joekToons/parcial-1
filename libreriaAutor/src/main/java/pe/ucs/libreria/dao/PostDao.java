package pe.ucs.libreria.dao;


import java.util.List;
import pe.ucs.libreria.model.Post;



/**
 *
 * @author admin
 */
public interface PostDao {
    int create(Post autores);
    int update(Post autores);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
