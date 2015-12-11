package com.roslin.mwicks.spring.variation.model.ensemblgene;

import com.roslin.mwicks.spring.variation.dto.DTOEnsemblGene;

/**
 * An utility class which contains useful methods for unit testing person related
 * functions.
 * @author Petri Kainulainen
 */
public class EnsemblGeneTestUtil {

    public static DTOEnsemblGene createDTO(
    		Long oid,
            String ensemblId,
            String region,
            String chromosomeId,
            String start,    
            String end,
            String strand
    		) {
    
        DTOEnsemblGene dto = new DTOEnsemblGene();

        dto.setOid(oid);
        dto.setEnsemblId(ensemblId);
        dto.setRegion(region);
        dto.setChromosomeId(chromosomeId);
        dto.setStart(start);
        dto.setEnd(end);
        dto.setStrand(strand);

        return dto;
    }

    
    public static EnsemblGene createModelObject(
    		Long oid,
            String ensemblId,
            String region,
            String chromosomeId,
            long start,    
            long end,
            String strand
        ) {
    
        EnsemblGene model = EnsemblGene.getBuilder(
            ensemblId,
            region,
            chromosomeId,
            start,    
            end,
            strand
        ).build();

        model.setOid(oid);

        return model;
    }
}
