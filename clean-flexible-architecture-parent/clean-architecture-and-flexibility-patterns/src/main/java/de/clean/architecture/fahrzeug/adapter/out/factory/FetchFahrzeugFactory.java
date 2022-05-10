package de.clean.architecture.fahrzeug.adapter.out.factory;

import com.google.inject.Provides;
import de.clean.architecture.fahrzeug.adapter.out.service.client.FahrzeugServiceClient;
import de.clean.architecture.fahrzeug.adapter.out.tmp.db.FahrzeugTmpRepository;
import de.clean.architecture.fahrzeug.usecase.out.FetchFahrzeug;

public class FetchFahrzeugFactory {

    @Provides
    public FetchFahrzeug createOutputAdapter() {
        String configuration = System.getProperty("stammdatenservice-adapter");
        if (configuration.equals("TMP_DB")) {
            return new FahrzeugTmpRepository();
        }
        return new FahrzeugServiceClient();
    }
}
