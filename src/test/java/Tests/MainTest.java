package Tests;

import Helpers.Helpers;
import Pages.*;
import org.junit.Test;

public class MainTest extends TestFixture {

    @Test
    public void Test() throws Exception {

        // Initialize Selenium Web Driver and open tu-sofia.bg
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.OpenPage();
        landingPage.AllElementsPresent();
        landingPage.OpenStudentsPage();

        // Verify that Student page is opened
        StudentPage studentPage = new StudentPage(getDriver());
        studentPage.AllElementsPresent();

        //UISS page
        UISSPage uissPage = new UISSPage(getDriver());
        //Open UISS page and verify it
        uissPage.OpenUISSPage();
        uissPage.AllElementsPresent();
        //Open University Information System Page
        uissPage.OpenLinks(getDriver(),uissPage.getUissLink());

        // Academic Calendar page
        AcademicCalendar academicCalendar = new AcademicCalendar(getDriver());
       //Open Academic calendar page
        academicCalendar.OpenAcademicCalendar();
        //Verify Academic page
        academicCalendar.AllElementsPresent();
        // Verify Master and Bacherlor tabs for 2016/2017
        academicCalendar.OpenMasterTab();
        academicCalendar.OpenBacherlorPDF();

        // Weekly program page
        WeeklyPrograms weeklyPrograms = new WeeklyPrograms(getDriver());
        // Open Weekly Program page and verify it
        weeklyPrograms.OpenWeeklyProgramsPage();
        weeklyPrograms.AllElementsPresent();
        // Select and click FSKU Faculty
        Helpers.selectFromDropDown(weeklyPrograms.getDropdown(),"Факултет Компютърни системи и управление");
        weeklyPrograms.ClickFilterButton();
        // Click Master tab
        Helpers.ClickTabByName(weeklyPrograms.getMaster(),"Магистър");
        // Click Master 2 tab
        Helpers.ClickTabByName(weeklyPrograms.getMastereq(),"Магистър-изравнителен");
        // Click Master 3 tab
        Helpers.ClickTabByName(weeklyPrograms.getMastercompl(),"Магистър-допълващо");

        // Exam page
        ExamsPage examsPage = new ExamsPage(getDriver());
        // Open Exam page and verify it
        examsPage.OpenExams();
        examsPage.AllElementsPresent();
        // Select and click FSKU Faculty
        Helpers.selectFromDropDown(examsPage.getDropdown(),"Факултет Компютърни системи и управление");
        examsPage.FilterFaculty();
        // Click Master tab
        Helpers.ClickTabByName(examsPage.getMaster(),"Магистър");
        // Click Master 2 tab
        Helpers.ClickTabByName(examsPage.getMastereq(),"М. Подготвителен");
        // Click Master 3 tab
        Helpers.ClickTabByName(examsPage.getMastercompl(),"М. подг. след проф. бак.");

        // Cirriculum page
        Curriculum curriculumPage = new Curriculum(getDriver());
        // Opeb and verify Cirriculim page
        curriculumPage.OpenActiveSchedule();
        curriculumPage.AssertElementsArePresent();
        // Select FKSU Faculty
        Helpers.selectFromDropDown(curriculumPage.getDropdown(),"Факултет Компютърни системи и управление");
        curriculumPage.FilterFaculty();
        // Click Masters tab
        Helpers.ClickTabByName(curriculumPage.getMaster(),"Магистър");
        Helpers.ClickTabByName(curriculumPage.getMastereq(),"Маг.-изравнителен");
        Helpers.ClickTabByName(curriculumPage.getMastercompl(),"Маг.-допълващо");
        Helpers.ClickTabByName(curriculumPage.getMastereqbach(),"Маг-изравн.проф.бак.");
        Helpers.ClickTabByName(curriculumPage.getMasterprofbach(),"Маг-проф.бак.");
        Helpers.ClickTabByName(curriculumPage.getProfbach(),"Проф.бак.");
        Helpers.ClickTabByName(curriculumPage.getTeacher(),"Учител");

        //Scholarship page
        ScholarshipPage scholarshipPage = new ScholarshipPage(getDriver());
        // Open and verify scholarship page
        scholarshipPage.OpenScholarshipPage();
        scholarshipPage.AssertAllElementsArePresent();
        scholarshipPage.OpenNotice();

        // StudentCard Page
        StudentCardPage cardPage = new StudentCardPage(getDriver());
        // Open and verify StudentCard Page
        cardPage.OpenStudentCardPage();
        cardPage.AllElementsPresent();
        // Open ISIC Page
        cardPage.ClickISICLink();

        // CreditInfoPage
        CreditInfoPage creditInfoPage = new CreditInfoPage(getDriver());
        // Open CreditInfo Page and verify it
        creditInfoPage.ClickCreditInfoButton();
        // Click law sub tab
        Helpers.scrollToElement(creditInfoPage.getLawTab(),getDriver());
        creditInfoPage.ClickLawTab();
        // Collapse the law subtab
        Helpers.scrollToElement(creditInfoPage.getLawTab(),getDriver());
        creditInfoPage.ClickToggleButton();
        Helpers.scrollToElement(creditInfoPage.getCreditInfoButton(),getDriver());

        // Internship page
        InternshipPage internshipPage = new InternshipPage(getDriver());
        // Open Internship page and verify it
        internshipPage.OpenInternshipPage();
        // Open tu-sofia link
        Helpers.scrollToElement(internshipPage.getTuSofiaLink(),getDriver());
        internshipPage.OpenTuSofiaLink();
        // Open Erasum Link
        Helpers.scrollToElement(internshipPage.getInternshipLink(),getDriver());
        internshipPage.getErasumLink();
        Helpers.scrollToElement(internshipPage.getInternshipLink(),getDriver());

        // Student Mobility page
        StudentMobilityPage studentMobilityPage = new StudentMobilityPage(getDriver());
        // Open and Verify Student Mobility page
        studentMobilityPage.OpenStudentMobilityPage();
        studentMobilityPage.AssertStudentMobiltyPage();

        //  Student Organisation page
        StudentOrganisationPage studentOrganisationPage = new StudentOrganisationPage(getDriver());
        // Open and verify the page
        studentOrganisationPage.OpenStudentOrganisationPage();
        studentOrganisationPage.AssertStudentOrganisationPage();
        // Open AISEC link
        studentOrganisationPage.OpenLinks(getDriver(),studentOrganisationPage.getAisecLink());
        // Open Best Link
        Helpers.scrollToElement(studentOrganisationPage.getBestLink(),getDriver());
        studentOrganisationPage.OpenLinks(getDriver(),studentOrganisationPage.getBestLink());
        // Open Estiem Link
        Helpers.scrollToElement(studentOrganisationPage.getEstiemLink(),getDriver());
        studentOrganisationPage.OpenLinks(getDriver(),studentOrganisationPage.getEstiemLink());

        //Dorm Page
        DormsPage dormsPage = new DormsPage(getDriver());
        //Open and verify Dorms Page
        dormsPage.OpenDormPage();

        //Dorm Page - Accomodation Subpage
        DormsAccomodationPage dormsAccomodationPage = new DormsAccomodationPage(getDriver());
        //Open and verify Accomodation Page
        dormsAccomodationPage.OpenAccomodationPage();
        //Open Document 1
        dormsAccomodationPage.OpenAccomodatiionLinks(getDriver(), dormsAccomodationPage.getAccDoc1());
        //Open Document 2
        dormsAccomodationPage.OpenAccomodatiionLinks(getDriver(), dormsAccomodationPage.getAccDoc2());

        //Dorm Page - Regulation SubPage
        DormsRegulationsPage dormsRegulationsPage = new DormsRegulationsPage(getDriver());
        //Open and verify page
        dormsRegulationsPage.OpenDormsRegulationsPage();
        //Open Regulation 1
        dormsRegulationsPage.OpenDormsRegulationsLinks(getDriver(),dormsRegulationsPage.getRegDoc1());
        //Open Reguldation 2
        dormsRegulationsPage.OpenDormsRegulationsLinks(getDriver(), dormsRegulationsPage.getRegDoc2());

        //Dorm Page - Rent SubPage
        DormsRentPage dormsRentPage = new DormsRentPage(getDriver());
        //Open and verify the page
        dormsRentPage.OpenDormRentPage();

        //Sport Page
        SportPage sportPage = new SportPage(getDriver());
        //Open and verify Sport Page
        sportPage.OpenSportPage();

        //Sport Page - Sport Complex SubPage
        SportComplexPage sportComplexPage = new SportComplexPage(getDriver());
        //Open and verify Sport Complex Page
        sportComplexPage.OpenSportComplexPage();

        //Sport Page - Sport Recreation SubPage
        SportRecreationPage sportRecreationPage = new SportRecreationPage(getDriver());
        //Open and verify Sport Recreaation Page
        sportRecreationPage.OpenSportRecreationPage();

        //Sport Page - Sport Signup SubPage
        SportSignUpPage sportSignUpPage = new SportSignUpPage(getDriver());
        //Open and verify Sport Signup Page
        sportSignUpPage.OpenSportSignUpPage();
        //Open Sport Sign up Link
        sportSignUpPage.OpenLinks(getDriver(), sportSignUpPage.getSignUpSportLink());


    }
}
