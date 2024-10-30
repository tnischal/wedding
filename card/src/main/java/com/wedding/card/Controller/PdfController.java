package com.wedding.card.Controller;

import com.wedding.card.PDFService.InvitationService;
import com.wedding.card.dto.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class PdfController {


    @Autowired
    private InvitationService invitationService;



    @GetMapping(value = "/generate1")
    public String generateImage(@RequestBody Info info) throws IOException {
         invitationService.createInvitation(info);
        return "Done";
    }

    @PostMapping(value = "/add")
    public String postData(@RequestBody Info info) {
        invitationService.addMember(info);
        return "DoneDone";
    }

    @GetMapping(value="/list")
    public String listofNames() throws IOException {
        invitationService.CreateListOfInvitation();
        return "Done";
    }
}
