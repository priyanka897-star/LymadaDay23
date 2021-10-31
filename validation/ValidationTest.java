package validation;


//import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



	 class ValidationTest  implements ValidateUserDetails{

		@Test
		public  static void givenFirstName_WhenProper_ShouldReturnTrue() {
			//RuleMemberValidator uv = new RuleMemberValidator(null);
			boolean result= ValidateUserDetails.validateFirstName("Priyanka");
			Assertions.assertTrue(result);

		}

		@Test
		public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateFirstName("priya");
			Assertions.assertFalse(result);
		}

		@Test
		public void givenTwoLetters_CheckForValidation_ReturnFalse() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateFirstName("Pr");
			Assertions.assertFalse(result);
		}

		@Test
		void givenLasrName_CheckForValidationForLName_ReturnTrue() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateLastName("More");
			Assertions.assertTrue(result);
		}

		@Test
		void givenTwoSmalls_CheckForValidationForLName_RetrunFalse() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateLastName("more");
			Assertions.assertFalse(result);
		}

		@Test
		void givenEmail_CheckForValidationForEmail_RetrunTrue() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateEmails("abc.xyz@bl.com");
			Assertions.assertTrue(result);
		}

		@Test
		void givenEmail_CheckForValidationForEmail_RetrunFalse() {
			//UserValidator validator = new UserValidator();
			boolean result =ValidateUserDetails.validateEmails("abc.xyz@bl");
			Assertions.assertFalse(result);
		}

		@Test
		void givenEmail_CheckForValidationForMobile_RetrunTrue() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateMobile("98 9808229348");
			Assertions.assertTrue(result);
		}

		@Test
		void WithoutSpace_CheckForValidationForMobile_RetrunFalse() {
			//UserValidator validator = new UserValidator();
			boolean result = ValidateUserDetails.validateMobile("919874563214");
			Assertions.assertFalse(result);
		}

		@Test
		void givenPassword_CheckForValidationForPasswordRule4_RetrunTrue() {
			//UserValidator validator = new UserValidator();
			boolean result =ValidateUserDetails.validatePassword("Srewoirfjkbh#3");
			Assertions.assertTrue(result);
		}

		@Test
		void withoutRule4_CheckForValidationForPasswordRule4_ReturnFalse() {
			//UserValidator validator = new UserValidator();
			boolean result =ValidateUserDetails.validatePassword("Sbvdfrjjbcxv5");
			Assertions.assertFalse(result);
		}
		
		 
		
		
	}
	 
	 


