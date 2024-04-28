package com.adoptdifferently.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExternalAPIServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ExternalAPIService externalAPIService;

    @Test
    void testGetAllAdoptionCenters() {
        // Given
        String query = "someQuery";
        String field = "someField";
        String sort = "someSort";
        String expectedUrl = "https://api.adoptapet.me/ac?q=someQuery&someField&sort=someSort";
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getAllAdoptionCenters(query, field, sort);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testGetAdoptionCenterById() {
        // Given
        String id = "someId";
        String expectedUrl = "https://api.adoptapet.me/ac/" + id;
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getAdoptionCenterById(id);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testGetAllPetSpeciesAndBreeds() {
        // Given
        String query = "someQuery";
        String field = "someField";
        String sort = "someSort";
        String expectedUrl = "https://api.adoptapet.me/sb?q=someQuery&someField&sort=someSort";
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getAllPetSpeciesAndBreeds(query, field, sort);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testGetPetSpeciesAndBreedById() {
        // Given
        String id = "someId";
        String expectedUrl = "https://api.adoptapet.me/sb/" + id;
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getPetSpeciesAndBreedById(id);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testGetAllAdoptablePets() {
        // Given
        String query = "someQuery";
        String field = "someField";
        String sort = "someSort";
        String expectedUrl = "https://api.adoptapet.me/ap?q=someQuery&someField&sort=someSort";
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getAllAdoptablePets(query, field, sort);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testGetAdoptablePetById() {
        // Given
        String id = "someId";
        String expectedUrl = "https://api.adoptapet.me/ap/" + id;
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.getAdoptablePetById(id);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }

    @Test
    void testSitewideSearch() {
        // Given
        String query = "someQuery";
        String expectedUrl = "https://api.adoptapet.me/search?q=someQuery";
        String mockResponse = "Mock response from AdoptAPet API";

        when(restTemplate.getForObject(expectedUrl, String.class)).thenReturn(mockResponse);

        // When
        String response = externalAPIService.sitewideSearch(query);

        // Then
        verify(restTemplate, times(1)).getForObject(expectedUrl, String.class);
        assertEquals(mockResponse, response);
    }
}
