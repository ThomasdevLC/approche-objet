package fr.diginamic.recensement;
import java.util.Comparator;

public class ComparatorRegions implements Comparator<Region> {
    @Override
    public int compare(Region RegionA, Region RegionB) {
        return Integer.compare(RegionB.getPopulationRegion(), RegionA.getPopulationRegion());
    }
}