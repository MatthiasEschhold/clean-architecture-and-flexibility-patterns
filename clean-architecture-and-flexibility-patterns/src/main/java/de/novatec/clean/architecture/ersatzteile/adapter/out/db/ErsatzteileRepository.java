package de.novatec.clean.architecture.ersatzteile.adapter.out.db;

import de.novatec.clean.architecture.ersatzteile.domain.model.Ersatzteil;
import de.novatec.clean.architecture.ersatzteile.usecase.out.ErsatzteileDbQuery;

import java.util.List;

public class ErsatzteileRepository implements ErsatzteileDbQuery {

    @Override
    public List<Ersatzteil> findErsatzteileForKategorie(String fahrzeugmodell, String fahrzeugtyp) {
        return null;
    }
}
