package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration clientHttpConf = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConf);

            petService.importarPets();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
