package com.Maxim.service;


import com.Maxim.model.Writer;
import com.Maxim.repository.WriterRepository;
import com.Maxim.repository.hibernate.HibernateWriterRepositoryImpl;

import java.util.List;

public class WriterService {

    private final WriterRepository hibernateWriterRepository = new HibernateWriterRepositoryImpl();

    public Writer save(Writer writer) {
        return hibernateWriterRepository.save(writer);
    }

    public Writer getWriterById(Integer writerId){
        return hibernateWriterRepository.getById(writerId);
    }

    public List<Writer> getAllWriters() {
        return hibernateWriterRepository.getAll();
    }

    public Writer updateWriter(Writer writer) {
        return hibernateWriterRepository.update(writer);
    }

    public void deleteWriterById (Integer id){
        hibernateWriterRepository.deleteById(id);
    }
}
