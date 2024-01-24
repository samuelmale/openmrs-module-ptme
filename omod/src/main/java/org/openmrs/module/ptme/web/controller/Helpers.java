package org.openmrs.module.ptme.web.controller;

import java.util.Arrays;
import java.util.List;

import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;

// TODO: Reference concepts by UUIDs
public class Helpers {
    public static List<Obs> getNObservations(Patient patient, Integer conceptId, Integer n) {
        return Context.getObsService().getObservations(Arrays.asList(patient), null, Arrays.asList(Context.getConceptService().getConcept(conceptId)), null, null, null, null, n, null, null, null, false, null);
    }
}
