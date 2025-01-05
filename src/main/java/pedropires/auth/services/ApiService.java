package pedropires.auth.services;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    /**
     * Method to return a success message to prove that you are authenticated
     *
     * @return String with a message
     */
    public String getSuccessMessage() {
        return "Hello World";
    }


}
