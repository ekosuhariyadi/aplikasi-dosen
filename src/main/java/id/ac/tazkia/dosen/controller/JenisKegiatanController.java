package id.ac.tazkia.dosen.controller;

/**
 * Created by yogi on 03/05/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class JenisKegiatanController {

    @RequestMapping("/jeniskegiatan/list")
    public ModelMap Programstudi(){
        return new ModelMap();
    }

    @RequestMapping(value = "/jeniskegiatan/form", method = RequestMethod.GET)
    public void tampilkanForm() {
    }
}