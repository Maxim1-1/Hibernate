package com.Maxim.controller;

import com.Maxim.model.Writer;
import com.Maxim.service.WriterService;

import java.util.HashMap;
import java.util.List;

public class WriterController {

    private WriterService writerService = new WriterService();

    public Writer save(HashMap<String, String> dataFromConsole) {
        Writer writer = new Writer();
        writer.setFirstName(dataFromConsole.get("firstName"));
        writer.setLastName(dataFromConsole.get("lastName"));
        return writerService.save(writer);
    }


    public Writer getWriterById(Integer writerId) {
        return writerService.getWriterById(writerId);

    }

    public List<Writer> getAllWriter() {
        return writerService.getAllWriters();
    }

    public void deleteWriterById(Integer writerId) {
        writerService.deleteWriterById(writerId);
    }

    public Writer updateWriterById(Integer writerId, HashMap<String, String> updatedData) {
        Writer writer = writerService.getWriterById(writerId);

        updatedData.forEach((key, value) -> {
            switch (key) {
                case "firstName":
                    writer.setFirstName(updatedData.get("firstName"));
                    break;
                case "lastName":
                    writer.setLastName(updatedData.get("lastName"));
                    break;
            }
        });
       return writerService.updateWriter(writer);
    }
}
