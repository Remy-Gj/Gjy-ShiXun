package cn.ty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class FileConfigurer implements WebMvcConfigurer {

    @Value("${file.upload.path}")
    private String filePath;
    @Value("${file.upload.relative.path}")
    private String relativePath;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //指定虚拟路径                                    指定真实的路径
        registry.addResourceHandler(relativePath).addResourceLocations("file:/"+filePath);
    }
}
