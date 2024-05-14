package hexlet.code.dto.urls;

import hexlet.code.dto.BasePage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import hexlet.code.model.Url;

import java.util.List;

@AllArgsConstructor
@Getter
public class UrlsPage extends BasePage {
    private List<Url> urls;
}
