package de.novatec.clean.architecture.ersatzteile.usecase.out;

import de.novatec.clean.architecture.ersatzteile.domain.model.Ersatzteil;

import java.util.List;

public interface ErsatzteileDbQuery {
    List<Ersatzteil> findErsatzteileForKategorie(String fahrzeugmodell, String fahrzeugtyp);
}
