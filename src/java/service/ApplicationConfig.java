/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author iamGG
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.AdminFacadeREST.class);
        resources.add(service.ArticleFacadeREST.class);
        resources.add(service.ArticleRatingFacadeREST.class);
        resources.add(service.ContactFacadeREST.class);
        resources.add(service.DiseaseFacadeREST.class);
        resources.add(service.DiseaseRatingFacadeREST.class);
        resources.add(service.HealthFoodFacadeREST.class);
        resources.add(service.HerbCommentFacadeREST.class);
        resources.add(service.HerbFacadeREST.class);
        resources.add(service.HerbImgFacadeREST.class);
        resources.add(service.HerbRatingFacadeREST.class);
        resources.add(service.HerbResearchFacadeREST.class);
        resources.add(service.InfographicFacadeREST.class);
        resources.add(service.InfographicRatingFacadeREST.class);
        resources.add(service.PharmacistFacadeREST.class);
    }
    
}
