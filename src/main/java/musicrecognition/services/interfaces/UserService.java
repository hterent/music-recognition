package musicrecognition.services.interfaces;

import musicrecognition.dto.UserDto;
import musicrecognition.entities.User;
import org.springframework.dao.DuplicateKeyException;


public interface UserService {
    /**
     * @return <ul>
     *     <li>id generated by database</li>
     *     <li>null if user is empty or one of the not null fields is empty</li>
     * </ul>
     * @throws DuplicateKeyException if entity violates unique constraint
     * */
    Integer insert(User user) throws DuplicateKeyException;
    
    org.springframework.security.core.userdetails.User getSpringUserByUsername(String username);
    
    User dtoToEntity(UserDto userDto);
}
