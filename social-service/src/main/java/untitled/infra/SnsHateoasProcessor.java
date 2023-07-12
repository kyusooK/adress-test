package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class SnsHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Sns>> {

    @Override
    public EntityModel<Sns> process(EntityModel<Sns> model) {
        return model;
    }
}
