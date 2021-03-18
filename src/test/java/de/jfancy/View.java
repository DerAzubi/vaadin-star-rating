/* © Copyright JFancy 2021 www.jfancy.de */
package de.jfancy;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * Test View
 *
 * @author Marcus
 * @author JFancy
 */
@Route("")
public class View extends Div {

    /**
     * bla bla
     */
    private static final long serialVersionUID = 1L;

    public View() {

        // Component erstellen
        StarsRating starsRating = new StarsRating();
        // Listener Hinzufügen
        starsRating.addValueChangeListener(e -> {
            System.out.println("Value has changed to: " + starsRating.getValue());
        });

        // Button zum auslesen erstellen
        Button btn = new Button("Test Button");
        btn.addClickListener(e -> {
            System.out.println("Value: " + starsRating.getValue());
        });

        // Components zum Layout hinzufügen
        add(starsRating, btn);
    }
}