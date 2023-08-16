package com.kitaplik.libraryservice.service;

import com.kitaplik.libraryservice.dto.LibraryDto;
import com.kitaplik.libraryservice.exception.LibraryNoFoundException;
import com.kitaplik.libraryservice.model.Library;
import com.kitaplik.libraryservice.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryDto getAllBooksInLibraryById(String id){
        Library library = libraryRepository.findById(id)
                .orElseThrow(()->new LibraryNoFoundException("library Not found by ıd:" + id));
        LibraryDto libraryDto = new LibraryDto(library.getId());
        return libraryDto;
    }

    public LibraryDto createLibrary(){
        Library library = libraryRepository.save(new Library());
        return new LibraryDto(library.getId());
    }
}
