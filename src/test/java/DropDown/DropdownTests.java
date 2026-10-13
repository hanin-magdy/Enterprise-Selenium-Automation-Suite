package DropDown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdownPage();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"Incorrect Number Of Options");
        Assert.assertTrue(selectedOptions.contains(option),"The Option Was not selected");

    }
}
