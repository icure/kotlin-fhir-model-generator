//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancesourcematerial

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 4.9.13.8.1 Hybrid species maternal organism ID (Optional)
 *
 * 4.9.13.8.1 Hybrid species maternal organism ID (Optional).
 *
 * @param id Unique id for inter-element referencing
 * @param maternalOrganismId The identifier of the maternal species constituting the hybrid organism
 * shall be specified based on a controlled vocabulary. For plants, the parents aren’t always known,
 * and it is unlikely that it will be known which is maternal and which is paternal
 * @param maternalOrganismName The name of the maternal species constituting the hybrid organism
 * shall be specified. For plants, the parents aren’t always known, and it is unlikely that it will be
 * known which is maternal and which is paternal
 * @param paternalOrganismId The identifier of the paternal species constituting the hybrid organism
 * shall be specified based on a controlled vocabulary
 * @param paternalOrganismName The name of the paternal species constituting the hybrid organism
 * shall be specified
 * @param hybridType The hybrid type of an organism shall be specified
 */
@SerialName("SubstanceSourceMaterialOrganismHybrid")
@Serializable
public data class SubstanceSourceMaterialOrganismHybrid(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The identifier of the maternal species constituting the hybrid organism shall be specified
   * based on a controlled vocabulary. For plants, the parents aren’t always known, and it is unlikely
   * that it will be known which is maternal and which is paternal
   */
  public val maternalOrganismId: String? = null,
  /**
   * The name of the maternal species constituting the hybrid organism shall be specified. For
   * plants, the parents aren’t always known, and it is unlikely that it will be known which is
   * maternal and which is paternal
   */
  public val maternalOrganismName: String? = null,
  /**
   * The identifier of the paternal species constituting the hybrid organism shall be specified
   * based on a controlled vocabulary
   */
  public val paternalOrganismId: String? = null,
  /**
   * The name of the paternal species constituting the hybrid organism shall be specified
   */
  public val paternalOrganismName: String? = null,
  /**
   * The hybrid type of an organism shall be specified
   */
  public val hybridType: CodeableConcept? = null,
) : BackboneElement
