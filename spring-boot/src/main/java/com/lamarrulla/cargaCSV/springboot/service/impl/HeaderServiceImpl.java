package com.lamarrulla.cargaCSV.springboot.service.impl;

import com.lamarrulla.cargaCSV.springboot.dto.HeaderDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseHeaderDTO;
import com.lamarrulla.cargaCSV.springboot.entity.Header;
import com.lamarrulla.cargaCSV.springboot.repository.IHeaderRepository;
import com.lamarrulla.cargaCSV.springboot.service.IHeaderService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeaderServiceImpl implements IHeaderService {

    private final IHeaderRepository iHeaderRepository;

    public HeaderServiceImpl(IHeaderRepository iHeaderRepository) {
        this.iHeaderRepository = iHeaderRepository;
    }

    @Override
    public ResponseHeaderDTO findAll() {
        List<Header> headerList = iHeaderRepository.findAll();
        return entityToDTOHeaderList(headerList);
    }

    @Override
    public ResponseHeaderDTO save(HeaderDTO headerDTO) {
        iHeaderRepository.save(DTOtoEnittyHeader(headerDTO));
        return findAll();
    }

    @Override
    public ResponseHeaderDTO saveBulk(String string) {
        String row[] = string.split("\n");
        Arrays.stream(row).forEach(c->{
            String headers[] = c.split(",");
            try {
                Header header = new Header(
                        Long.parseLong(headers[4]),
                        new SimpleDateFormat("dd/MM/yyyy").parse(headers[4]),
                        new SimpleDateFormat("dd/MM/yyyy").parse(headers[4]),
                        new SimpleDateFormat("dd/MM/yyyy").parse(headers[4]),
                        Long.parseLong(headers[4]),
                        headers[4],
                        Long.parseLong(headers[4]),
                        headers[4],
                        Integer.parseInt(headers[4]),
                        Integer.parseInt(headers[4]),
                        Integer.parseInt(headers[4])
                );
                iHeaderRepository.save(header);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
        return findAll();
    }

    private Header DTOtoEnittyHeader(HeaderDTO headerDTO){
        return new Header(
                headerDTO.getIdDetalle(),
                headerDTO.getFechaInicio(),
                headerDTO.getFechaEnt(),
                headerDTO.getFechaCan(),
                headerDTO.getNoTienda(),
                headerDTO.getNomTiemda(),
                headerDTO.getCodProvedor(),
                headerDTO.getNomProvedor(),
                headerDTO.getTipoPedido(),
                headerDTO.getNumInter(),
                headerDTO.getNumTrans()
        );
    }

    private HeaderDTO entityToDTOHeader(Header header){
        return new HeaderDTO(
                header.getIdDetalle(),
                header.getFechaInicio(),
                header.getFechaEnt(),
                header.getFechaCan(),
                header.getNoTienda(),
                header.getNomTiemda(),
                header.getCodProvedor(),
                header.getNomProvedor(),
                header.getTipoPedido(),
                header.getNumInter(),
                header.getNumTrans()
        );
    }

    private ResponseHeaderDTO entityToDTOHeaderList(List<Header> headerList){
        List<HeaderDTO> headerDTOList = new ArrayList<>();
        ResponseHeaderDTO responseHeaderDTO = new ResponseHeaderDTO();
        headerList.stream().forEach(c->{
            HeaderDTO headerDTO = entityToDTOHeader(c);
            headerDTOList.add(headerDTO);
        });
        responseHeaderDTO.setHeaderDTOList(headerDTOList);
        return responseHeaderDTO;
    }

}
