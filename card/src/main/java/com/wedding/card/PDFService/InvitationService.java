package com.wedding.card.PDFService;

import com.wedding.card.Entity.NameListEntity;
import com.wedding.card.Repo.NameListRepo;
import com.wedding.card.dto.Info;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class InvitationService {

    @Autowired
    NameListRepo nameListRepo;
    public void createInvitation(Info info) throws IOException {
        // Load the background image
        BufferedImage background = ImageIO.read(new File("/Users/nischaltimsina/Downloads/card/src/main/resources/static/pic.jpg"));
        Graphics2D g = background.createGraphics();

        // Set the font (make sure to load the Nepali font correctly)
        Font nepaliFont = new Font("/Users/nischaltimsina/Library/Fonts/PREETI.TTF\"", Font.PLAIN, 24);
        g.setFont(nepaliFont);
        g.setColor(Color.WHITE);

        // Write the name and addresses onto the image
        g.drawString(info.getName(), 510, 1200);       // Adjust x, y positions as needed
        g.drawString(info.getAddress1(), 510, 1280);
        g.drawString(info.getAddress2(), 510, 1360);

        g.dispose(); // Dispose graphics context

        // Save the image
        String outputFileName = "/Users/nischaltimsina/Downloads/Cards1/" + info.getName() + ".png";
        ImageIO.write(background, "jpg", new File(outputFileName));
    }

    public void CreateListOfInvitation() throws IOException {

        List<NameListEntity> nameListEntityList = nameListRepo.findAll();
            for( NameListEntity item: nameListEntityList){
                BufferedImage background = ImageIO.read(new File("/Users/nischaltimsina/Downloads/card/src/main/resources/static/pic.jpg"));
                Graphics2D g = background.createGraphics();

                // Set the font (make sure to load the Nepali font correctly)
                Font nepaliFont = new Font("/Users/nischaltimsina/Library/Fonts/PREETI.TTF\"", Font.PLAIN, 24);
                g.setFont(nepaliFont);
                g.setColor(Color.WHITE);

                // Write the name and addresses onto the image
                g.drawString(item.getName(), 510, 1200);       // Adjust x, y positions as needed
                g.drawString(item.getAddress1(), 510, 1280);
                g.drawString(item.getAddress2(), 510, 1360);

                g.dispose(); // Dispose graphics context

                // Save the image
                String outputFileName = "/Users/nischaltimsina/Downloads/Cards1/" + item.getName() + ".png";
                ImageIO.write(background, "jpg", new File(outputFileName));


        }



    }

    public void addMember(Info info) {
        NameListEntity name = new NameListEntity();
        BeanUtils.copyProperties(info,name);
        nameListRepo.save(name);
    }
}