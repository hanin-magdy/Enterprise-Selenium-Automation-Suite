package FileUpload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        var fileUploaderPage = homePage.clickFileUpload();
        String fileName = "Hanin.txt";
        fileUploaderPage.uploadFile("C:\\Users\\hp\\IdeaProjects\\FirstProject\\SeleniumCourse\\resources\\"+fileName);
        fileUploaderPage.clickSubmitButton();
        Assert.assertEquals(fileUploaderPage.getUploadedFileName(),fileName,
                "The file was not uploaded successfully");
    }
}
