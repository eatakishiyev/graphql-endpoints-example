package graphql.test.msscoreinfo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.test.msscoreinfo.model.Score;

import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {

    public List<Score> findScores(String hackathonId, Integer projectId) {
        return new ArrayList<>();
    }
}
