package kodlamaio.hrms.core.adapter;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.abstracts.ImageUploadService;

@Service
public class CloudinaryServiceAdapter implements ImageUploadService{

	Cloudinary cloudinary;
	
	@Autowired
	public CloudinaryServiceAdapter()
	{
		super();
		cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "coderbaydi",
				"api_key", "725359626633119",
				"api_secret", "SLKjwbtKdiZzm8Qe0jQZQiqOgMk"));
	}

	@Override
	public String imageUpload(String path) {
		try {
			Map uploadResult = cloudinary.uploader().upload(path, ObjectUtils.emptyMap());
			return uploadResult.get("url").toString();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	
		
	}
	
}