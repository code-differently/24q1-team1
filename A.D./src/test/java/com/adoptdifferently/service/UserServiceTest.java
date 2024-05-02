import com.adoptdifferently.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository; // Assuming UserRepository is the repository interface for User

    @InjectMocks
    private UserService userService = new UserServiceImpl(); // Assuming UserServiceImpl is the implementation of UserService

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddUser() {
        User user = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
        when(userRepository.save(user)).thenReturn(user);

        boolean result = userService.addUser(user);

        assertTrue(result);
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
        when(userRepository.existsById(1L)).thenReturn(true);
        when(userRepository.save(user)).thenReturn(user);

        boolean result = userService.updateUser(user);

        assertTrue(result);
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testDeleteUser() {
        long userId = 1L;
        when(userRepository.existsById(userId)).thenReturn(true);

        boolean result = userService.deleteUser(userId);

        assertTrue(result);
        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testGetUserById() {
        User user = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
        when(userRepository.findById(1L)).thenReturn(java.util.Optional.of(user));

        User result = userService.getUserById(1);

        assertNotNull(result);
        assertEquals(user, result);
    }

    @Test
    public void testGetAllUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1));
        userList.add(new User("Alice", "alice@example.com", "987654321", "password123", "USA", "Los Angeles", "90001", 2));
        when(userRepository.findAll()).thenReturn(userList);

        List<User> result = userService.getAllUsers();

        assertEquals(userList.size(), result.size());
        assertTrue(result.containsAll(userList));
    }
}
