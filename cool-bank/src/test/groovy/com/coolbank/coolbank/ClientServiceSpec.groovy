package com.coolbank.coolbank

import com.coolbank.coolbank.domain.Client
import com.coolbank.coolbank.repository.ClientRepository
import com.coolbank.coolbank.service.ClientService
import spock.lang.Specification
import spock.lang.Subject

class ClientServiceSpec extends Specification {

    ClientRepository repository = Stub()

    @Subject
    ClientService service = new ClientService(repository)

    void 'should get clients'() {
        given:
            repository.findAll() >> List.of(new Client())
        when:
            List<Client> result = service.getClients()
        then:
            result.size() == 1
    }
}
