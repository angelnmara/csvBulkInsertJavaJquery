package com.lamarrulla.cargaCSV.springboot.service.impl;

import com.lamarrulla.cargaCSV.springboot.dto.DetalleDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseDetalleDTO;
import com.lamarrulla.cargaCSV.springboot.entity.Detalle;
import com.lamarrulla.cargaCSV.springboot.repository.IDetalleRepository;
import com.lamarrulla.cargaCSV.springboot.service.IDetalleService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DetalleServiceImpl implements IDetalleService {

    private final IDetalleRepository iDetalleRepository;

    public DetalleServiceImpl(IDetalleRepository iDetalleRepository) {
        this.iDetalleRepository = iDetalleRepository;
    }

    @Override
    public ResponseDetalleDTO findAll() {
        List<Detalle> listDetalle = iDetalleRepository.findAll();
        return ListEntityDetalletorddto(listDetalle);
    }

    @Override
    public ResponseDetalleDTO save(DetalleDTO detalleDTO) {
        iDetalleRepository.save(detalleDTOtoEntity(detalleDTO));
        return null;
    }

    @Override
    public ResponseDetalleDTO saveBulk(String bulk) {
        String row[] = bulk.split("\n");
        Arrays.stream(row).forEach(c->{
            String detalles[] = c.split(",");
            Detalle detalle = new Detalle(0L                       //idDetalle
                    , Long.parseLong(detalles[4])                           //Articulo
                    , Long.parseLong(detalles[2])                           //Codigo
                    , detalles[10]                                           //Descripcion
                    , detalles[12]                                           //Marca
                    , Long.parseLong(detalles[8])                           //Depto
                    , Integer.parseInt(detalles[6])                         //CantPedida
                    , detalles[7]                                           //Medida
                    , Integer.parseInt(detalles[8])                         //UniEmp
                    , detalles[5]                                           //PreLista
                    , Double.valueOf(detalles[9])                          //CostoNeto
                    , Double.valueOf(detalles[16])                           //ImportePartida
                    , Integer.parseInt(detalles[17])                        //CantEmpaques
                    , detalles[13]                                          //TiendaDis
            );
            iDetalleRepository.save(detalle);
        });
        return findAll();
    }

    private Detalle detalleDTOtoEntity(DetalleDTO detalleDTO){
        Detalle detalle = new Detalle(detalleDTO.getIdDetalle()
                , detalleDTO.getArticulo()
                , detalleDTO.getCodigo()
                , detalleDTO.getDescripcion()
                , detalleDTO.getMarca()
                , detalleDTO.getDepto()
                , detalleDTO.getCantPedida()
                , detalleDTO.getMedida()
                , detalleDTO.getUniEmp()
                , detalleDTO.getPreLista()
                , detalleDTO.getCostoNeto()
                , detalleDTO.getImportePartida()
                , detalleDTO.getCantEmpaques()
                , detalleDTO.getTiendaDis()
        );
        return detalle;
    }

    private DetalleDTO DetalleEntityToDTO(Detalle detalle){
        return new DetalleDTO(detalle.getIdDetalle()
                , detalle.getArticulo()
                , detalle.getCodigo()
                , detalle.getDescripcion()
                , detalle.getMarca()
                , detalle.getDepto()
                , detalle.getCantPedida()
                , detalle.getMedida()
                , detalle.getUniEmp()
                , detalle.getPreLista()
                , detalle.getCostoNeto()
                , detalle.getImportePartida()
                , detalle.getCantEmpaques()
                , detalle.getTiendaDis()
        );
    }

    private ResponseDetalleDTO ListEntityDetalletorddto(List<Detalle> listDetalle){
        List<DetalleDTO> detalleDTOList = new ArrayList<>();
        ResponseDetalleDTO responseDetalleDTO = new ResponseDetalleDTO();
        listDetalle.stream().forEach(c-> {
            DetalleDTO detalleDTO = DetalleEntityToDTO(c);
            detalleDTOList.add(detalleDTO);
        });
        responseDetalleDTO.setDetalleDTOList(detalleDTOList);
        return responseDetalleDTO;
    }

}
