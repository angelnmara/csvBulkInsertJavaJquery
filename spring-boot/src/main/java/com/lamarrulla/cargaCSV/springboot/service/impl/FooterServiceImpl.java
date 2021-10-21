package com.lamarrulla.cargaCSV.springboot.service.impl;

import com.lamarrulla.cargaCSV.springboot.dto.FooterDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseFooterDTO;
import com.lamarrulla.cargaCSV.springboot.entity.Footer;
import com.lamarrulla.cargaCSV.springboot.repository.IFooterRepository;
import com.lamarrulla.cargaCSV.springboot.service.IFooterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FooterServiceImpl implements IFooterService {

    private final IFooterRepository iFooterRepository;

    public FooterServiceImpl(IFooterRepository iFooterRepository) {
        this.iFooterRepository = iFooterRepository;
    }

    @Override
    public ResponseFooterDTO findAll() {
        List<Footer> footerList = iFooterRepository.findAll();
        return new ResponseFooterDTO(entityToDTOFooterList(footerList));
    }

    @Override
    public ResponseFooterDTO save(FooterDTO footerDTO) {
        iFooterRepository.save(DTOToEntity(footerDTO));
        return findAll();
    }

    @Override
    public ResponseFooterDTO saveBulk(String string) {
        String row[] = string.split("\n");
        Arrays.stream(row).forEach(c->{
            String footers[] = c.split(",");
            Footer footer = new Footer(
                    Long.parseLong(footers[4]),
                    Long.parseLong(footers[4]),
                    Long.parseLong(footers[4]),
                    Long.parseLong(footers[4])
            );
            iFooterRepository.save(footer);
        });
        return findAll();
    }

    private List<FooterDTO> entityToDTOFooterList(List<Footer> footerList){
        List<FooterDTO> footerDTOList = new ArrayList<>();
        footerList.stream().forEach(c->{
            FooterDTO footerDTO = entityToDTOFooter(c);
            footerDTOList.add(footerDTO);
        });
        return footerDTOList;
    }

    private FooterDTO entityToDTOFooter(Footer footer){
        return new FooterDTO(
            footer.getIdFooter(),
            footer.getLuno(),
            footer.getLdos(),
            footer.getTotal()
        );
    }

    private Footer DTOToEntity(FooterDTO footerDTO){
        return new Footer(
                footerDTO.getIdFooter(),
                footerDTO.getLuno(),
                footerDTO.getLdos(),
                footerDTO.getTotal()
        );
    }

}
