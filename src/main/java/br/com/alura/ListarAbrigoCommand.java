package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command{

    @Override
    public void execute() {

        try {
            ClientHttpConfiguration clientHttpConf = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(clientHttpConf);

            abrigoService.listarAbrigos();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
