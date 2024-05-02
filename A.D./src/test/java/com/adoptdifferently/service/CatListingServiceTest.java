import com.adoptdifferently.model.CatListing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CatListingServiceTest {

    @Mock
    private CatListingRepository catListingRepository;

    @InjectMocks
    private CatListingService catListingService = new CatListingServiceImpl();

    @Test
    public void testGetAllCatListings() {
        // Mock data
        CatListing cat1 = new CatListing(1, "Fluffy", "Persian", 3, "New York", "Adorable fluffy cat");
        CatListing cat2 = new CatListing(2, "Whiskers", "Siamese", 2, "Los Angeles", "Playful Siamese kitten");
        List<CatListing> expectedCatListings = Arrays.asList(cat1, cat2);

        // Mock repository method to return mock data
        when(catListingRepository.findAll()).thenReturn(expectedCatListings);

        // Call service method
        List<CatListing> actualCatListings = catListingService.getAllCatListings();

        // Verify that the service method returns the expected data
        assertEquals(expectedCatListings, actualCatListings);
    }

    // Similarly, write tests for other CRUD methods (getCatListingById, deleteCatListingById, etc.)
}
