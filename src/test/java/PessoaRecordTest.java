import br.com.matheusleal.PessoaRecord;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PessoaRecordTest {

    @Test
    public void shouldDeserializeCorrectly() throws JsonProcessingException {
        String json = """
                {"nome": "Matheus Leal", "id": 1}
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        PessoaRecord pessoa = objectMapper.readValue(json, PessoaRecord.class);
        assertEquals("Matheus Leal", pessoa.nome());
        assertEquals(Long.valueOf(1), pessoa.id());
    }
}
