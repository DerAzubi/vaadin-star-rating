/* © Copyright JFancy 2021 www.jfancy.de */
package de.jfancy;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

public class ViewIT extends AbstractViewTest {

    @Test
    public void componentWorks() {
        final TestBenchElement paperSlider = $("stars-rating").first();
        // Check that stars-rating contains at least one other element, which means that
        // is has been upgraded to a custom element and not just rendered as an empty
        // tag
        Assert.assertTrue(paperSlider.$(TestBenchElement.class).all().size() > 0);
    }
}